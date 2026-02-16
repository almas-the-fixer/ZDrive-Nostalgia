##################
####17-10-2024####
##################

data <- read.csv('X:/sem5 r dmr/biscute.csv')
data

transactions <- as(data,'transactions')
transactions

itemFrequencyPlot(transactions, topN = 20)

rules = apriori(data,parameter = list(sup= 0.001,conf= 0.8,minlen=2,maxlen=3))
inspect(rules[1:10])

plot(rules,method='graph',engine="interactive")

plot(rules[1:10],method='graph',engine="interactive") #ggplot2,htmlwidget,visnetwork
