getwd()

################
###10-10-2024###
################

data <- datasets:: iris

data <- data[-5]

iris_scaled <- scale(data)

dist_matrix <- dist(iris_scaled,method = "euclidean")

hc <- hclust(dist_matrix,method = "complete")
summary(hc)
hc

plot(hc,main = "Hierarchical Clustering Dendrogram",xlab = "",sub = "",cex=0.6)

clusters <- cutree(hc,k=3)
clusters
iris$cluster <- as.factor(clusters)

plot(iris$Sepal.Length,iris$Sepal.Width,col = iris$cluster,pch = 19,main = "Hierarchical Clustering on iris dataset",xlab = "Sepal Length",ylab = "Sepal Width")
legend("topright",legend = levels(iris$cluster),col = 1:3,pch = 10)
