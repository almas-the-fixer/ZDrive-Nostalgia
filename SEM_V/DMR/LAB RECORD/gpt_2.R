# Load necessary libraries
library(datasets)
library(dbscan)

# Load the iris dataset (just using Petal.Length and Petal.Width for clustering)
data <- iris[, c("Petal.Length", "Petal.Width")]

# Apply DBSCAN clustering (for example)
DBSCAN_CL <- dbscan(data, eps = 0.5, MinPts = 5)

# Define colors for clusters 0, 1, and 2
colors <- c("black", "red", "green")  # black for noise, red for cluster 1, green for cluster 2

# Create the plot
plot(data$Petal.Length, data$Petal.Width,
     col = colors[DBSCAN_CL$cluster + 1],  # Adjusting for 0-based indexing
     pch = 19, 
     main = "XYZ", 
     xlab = "Petal Length", 
     ylab = "Petal Width")

# Optional: Add a legend
legend("topright", legend = c("Noise (0)", "Cluster 1 (1)", "Cluster 2 (2)"),
       col = colors, pch = 19)
