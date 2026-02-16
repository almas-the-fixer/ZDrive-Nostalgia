#
data1 <- datasets::iris
d1 <- data1[-5]
data_scaled <- scale(d1)

pca_result <- prcomp(data_scaled, center=TRUE, scale. = TRUE)
print(pca_result)

plot(pca_result, type='l')

boxplot(d1)

outliers_in_iris <- boxplot.stats(d1$Sepal.Width)$out
outlier_index <- which(d1$Sepal.Width %in% outliers_in_iris)
outlier_index