## Wildlife Tracker

An app for the forest service to track animals for an environmental impact study.

### Description

The Forest Service is considering a proposal from a timber company to clearcut a nearby forest of Douglas Fir. Before this proposal may be approved, they must complete an environmental impact study. This application was developed to allow Rangers to track wildlife sightings in the area.

### Setup

To create the necessary databases, launch postgres, then psql, and run the following commands:

* `CREATE DATABASE wildlife_tracker;`
* `\c wildlife_tracker;`
* `CREATE TABLE animals (id serial PRIMARY KEY, name varchar);`
* `CREATE TABLE endangered_animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar);`
* `CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar);`
* `CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;`

### Code Edits Made

* `In build.gradle there was a bad file name (archivesBaseName = "java_wilderness-tracker") changed to "java-wildlife-tracker";`
* `In endangered animal details, the id and name were displaying, but not the health or age until a sighting was added;`
* `Small copy error fixed and title given more distinction on animal.vtl: “ID: >$sighting.getId()” changed to  “Sighting ID: $sighting.getId()”;`
* `Copy edit on index.vtl: changed the All Animals list to Non-Endangered Specifically;`
* `AnimalTest.java: test name changed to “animal_instantiatesCorrectly_true” to reflect true value;`
* `AnimalTest.java: test name changed to “equals_returnsTrueIfNameIsTheSame” to reflect assertTrue method;`
* `Added line breaks and extended the strong tags on both the animal.vtl and the endangered_animal.vtl to make the logs more readable and distinct from each other;`
* `EndangeredAnimalTest.java: test name changed to “save_assignsIdAndSavesObjectToDatabase_true” to reflect assertEquals method;`
* `Added missing tests to EndangeredAnimalTest.java;`
* `AnimalTest.java: test name changed to “all_returnsAllInstancesOfAnimal_true” to reflect assertEquals method;`
* 'Changed all public member variables in EndangeredAnimal.java to private;`
* 'Added extends to EndangeredAnimal member variables to make EndangeredAnimal a child class of Animal;`
* ';`
* ';`
* ';`

### License

Copyright (c) 2017 **_MIT License_**
