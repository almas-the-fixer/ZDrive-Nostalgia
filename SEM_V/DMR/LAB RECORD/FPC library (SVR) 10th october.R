demo <- datasets::iris

demo <- iris[-5]
#Fitting DBscan Clustering model to training dataset
set.seed(220)

DBSCAN_CL <- dbscan(demo,eps = 0.45,MinPts = 5)
DBSCAN_CL

#Table
table(DBSCAN_CL$cluster, iris$Species)

#Plotting cluster
plotcluster(demo,DBSCAN_CL$cluster,main = "DBSCAN Clustering of Iris Dataset")
plot(DBSCAN_CL,demo,main = "DBSCAN")
plot(DBSCAN_CL,demo,main = "Petal Width VS Petal Length")

DBSCAN_CL$cluster
plot(demo[,c("Petal.Length","Petal.Width")],col = DBSCAN_CL$cluster,main = "XYZ")
