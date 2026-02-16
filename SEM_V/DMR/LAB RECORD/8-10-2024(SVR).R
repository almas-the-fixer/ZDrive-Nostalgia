getwd()
#############################
######### 8-10-2024 #########
#############################

#Include Library -> "Cluster"
library(cluster)

demo <- datasets::iris

unlabeled_demo <- demo[-5]
View(unlabeled_demo)

set.seed(123)

iris_kmediods <- pam(unlabeled_demo,k = 3)
class(iris_kmediods)
iris_kmediods

#plot(iris_kmediods[,c("Petal.Length","Petal.Width")],col = iris_kmediods$medoids)
plot(unlabeled_demo[,c("Petal.Length","Petal.Width")],col=iris_kmediods$clustering)
points(iris_kmediods$medoids[,c("Petal.Length","Petal.Width")],col=1:3,pch=15,cex=1)
