calculateCircleArea <- function(radius) {
    area <- radius * radius * pi

    return(area)
}

cat("Enter the radius")
radius <- 10
area <- calculateCircleArea(radius)
cat("Circle Area=", area, "\n")