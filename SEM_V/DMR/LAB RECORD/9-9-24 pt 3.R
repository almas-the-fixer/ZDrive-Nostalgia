Data(iris)

# Min max normalisation

normalised_data <- data.frame(Sepal.length = (iris$Sepal.Length - min(iris$Sepal.Length))/max(iris$Sepal.Length)-min(iris$Sepal.Length))

