#include <iostream>
using namespace std;


double calculateCircleArea(double radius) {
    double area = radius * radius * 3.14;

    return area;
}

int main() {
    cout << "Enter the radius:";
    double radius;
    cin >> radius;

    double area = calculateCircleArea(radius);
    cout << "Circle Area =" << area << endl;
    return 0;
}