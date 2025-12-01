#include <iostream>
using namespace std;
 
int main() {
    long long n = 0, m = 0, a = 0;
    cin >> n >> m >> a;
 
    long long rows = n / a;
    if (n % a != 0) {
         rows++;
    }
 
    long long cols = m / a;
    if (m % a != 0) {
        cols++;
    }
    
    long long totalTiles = rows * cols;
    cout << totalTiles << endl;
 
    return 0;
}
