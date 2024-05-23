# NoiseModelling-OSM
## Description

The project is to create WPS block for noiseModelling using géoClimate for create noise map

The current version use for géoClimate is the SNAPSHOT-1.0.2 because the 1.0.1 not work.

There's also a scrpit to run the main script with command lines. 
However, due to a dependency problem, it still doesn't work when run in a terminal. (it works fine in an IDE with parameter configuration).

If you want to configure the run of the command line in IntelliJ:

1. At the left of the runnable arrow click on "Current File" and chose "Edit Configuration"
2. Add a new configuration and click on Groovy.
3. Name it
4. In "Script Path" enter the absolute path of "GeoClimate_Script_CL" file
5. In "Working directory", enter the absolute path of "GeoClimate_Tools" directory
6. In program argument enter the option. For exemple : "-l Urbach -o C:noiseModelling\Block_WPS\GeoClimate_Tools\src\main\outPut\geoClimate -s 2154"
7. Save and run

There are 4 options. Options are :
- "-l" or "--location" for the location. Example : "Paris". **(required)**
- "-o" or "--output" for the output folder. Examble : "C:/temp/geoClimate". **(required)**
- "-s" or "--srid" for the Target projection identifier. Exemple : 2154. **(optional)**
- "-d" or "--database" for save or not the temp file .mv.db. Example : 1. **(optional)**

### Sources
- [noiseModelling](https://github.com/Universite-Gustave-Eiffel/NoiseModelling)
- [geoClimate](https://github.com/orbisgis/geoclimate)

