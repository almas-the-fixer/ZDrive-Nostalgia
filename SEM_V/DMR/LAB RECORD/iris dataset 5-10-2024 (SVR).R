iris_demo <- datasets::iris
class(iris_demo)
#Removing string value cols to make data unsupervised
d1 <- iris_demo[-5]
head(d1)

#Plotting
plot(d1$Sepal.Length,d1$Sepal.Width)
plot(d1$Petal.Length,d1$Petal.Width)

#Finding K means of iris dataset

iris_kmeans <- kmeans(d1,centers = 3)

#we can access specific values using $ and avalible components e.g $cluster etc

#Example finding clusters
iris_kmeans$cluster

#plotting by cluster

plot(d1[,c("Petal.Length","Petal.Width")],col = iris_kmeans$cluster)

#plotting with centroids

points(iris_kmeans$centers[,c("Petal.Length","Petal.Width")],col = 1:3,cex=8,pch = 5)

##  K medoids Algorithm  ##

#First we need to find Euclidean distance

euclidean_dist <- function(a,b){
  sqrt(sum((a-b)^2))
}

#Function to find medoid in cluster

find_medoid <- function(cluster_points){
  distances <- sapply(1:nrow(cluster_points),function(i){
    sum(sapply(1:nrow(cluster_points),function(j){
      euclidean_dist(cluster_points[i,],cluster_points[j,])
    }))
  })
  return(cluster_points[which.min(distances),,drop=FALSE])
}

# K medoids Algorithm











