#ADVANCED COMMANDS#
#DEMO DATASET IRIS
iris_demo <- iris
#Checking Data Type of this dataset
str(iris_demo)

#Q1 Select Specific Features
select(iris_demo,Sepal.Length) # select(dataset,specific_column you want to see)
#Q2 De select specific Feature
select(iris_demo,-Sepal.Length) # select(dataset,-specific_column you want to see)
