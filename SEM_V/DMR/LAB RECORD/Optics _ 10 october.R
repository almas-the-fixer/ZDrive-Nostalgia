##################
### INCOMPLETE ###
data <- datasets::iris

data <- data[-5]

iris_optics <- optics(data,eps = 0.5, minPts = 5)
iris_optics
iris_clusters <- iris_optics

plot(data$Sepal.Length,data$Sepal.Width,col=iris_)