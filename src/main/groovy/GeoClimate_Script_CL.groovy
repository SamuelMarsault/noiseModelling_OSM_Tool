/**
 * NoiseModelling is an open-source tool designed to produce environmental noise maps on very large urban areas. It can be used as a Java library or be controlled through a user friendly web interface.
 *
 * This version is developed by the DECIDE team from the Lab-STICC (CNRS) and by the Mixt Research Unit in Environmental Acoustics (Université Gustave Eiffel).
 * <http://noise-planet.org/noisemodelling.html>
 *
 * NoiseModelling is distributed under GPL 3 license. You can read a copy of this License in the file LICENCE provided with this software.
 *
 * Contact: contact@noise-planet.org
 *
 */

/**
 * @Author Samuel Marsault
 */

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import picocli.CommandLine
import java.util.concurrent.Callable

// ! The .jar to run the script on the command line does not work because at
// one point a groovy method does not exist in the .jar or in geoClimate but in the IDE sa works.

@CommandLine.Command(name = 'GeoClimate_Script_CL', mixinStandardHelpOptions = true, version = '1.0.1',
        description = 'Script for run Import_GeoClimate_Data')

class GeoClimate_Script_CL implements Callable<Integer> {

    private static final Integer SUCCESS = 0

    private static final Integer ERROR = 1

    @CommandLine.Option(names = ['-l', '--location'], description = 'Location of City or Street', required = true)
    String location

    @CommandLine.Option(names = ['-o', '--output'], description = 'Path of folder you want output result', required = true)
    String path

    @CommandLine.Option(names = ['-s', '--srid'], description = 'Target projection identifier (also called SRID) of your table', defaultValue = '2154')
    Integer srid

    @CommandLine.Option(names = ['-d', '--database'], description = 'Database use by geoClimate for create files (is a .mv.db)', defaultValue = '1')
    Integer dataBase

    @Override
    Integer call() throws Exception {
        Logger logger = LoggerFactory.getLogger("org.noise_planet.noisemodelling")

        def input = [
                "locations": location,
                "filesExportPath": path,
                "targetSRID": srid,
                "geoclimatedb": dataBase
        ]

        try {
            Import_GeoClimate_Data.execWithCommandLine(input)
        } catch (e) {
            logger.info('ERROR : '+ e.toString())
            return ERROR
        }
        return SUCCESS
    }

    static void main(String[] args) {
        int exitCode = new CommandLine(new GeoClimate_Script_CL()).execute(args)
        System.exit(exitCode)
    }

}
