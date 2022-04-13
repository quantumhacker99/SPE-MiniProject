FROM openjdk:8

LABEL author = "Hemanth Chitti"
LABEL version = 1.0
LABEL description = "This program simulates Scientific Calculator"

COPY ./target/ScientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT.jar", "calc.scientific_calculator.ScientificCalculator"]