# Load necessary libraries
library(datasets)
library(dendextend)

# Load data and scale it
data <- iris[-5]
iris_scaled <- scale(data)

# Calculate distance matrix and perform hierarchical clustering
dist_matrix <- dist(iris_scaled, method = "euclidean")
hc <- hclust(dist_matrix, method = "complete")

# Cut tree into 3 clusters
clusters <- cutree(hc, k = 3)
iris$cluster <- as.factor(clusters)

# Create a dendrogram from the hclust object
dend <- as.dendrogram(hc)

# Define colors for the clusters
colors <- c("red", "green", "blue")

# Set the colors for the branches based on the clusters
dend <- color_branches(dend, k = 3, col = colors)

# Plot the colored dendrogram
plot(dend, main = "Hierarchical Clustering Dendrogram", xlab = "", sub = "", cex = 0.6)

# Optional: Add rectangles around the clusters
rect.hclust(hc, k = 3, border = colors)
