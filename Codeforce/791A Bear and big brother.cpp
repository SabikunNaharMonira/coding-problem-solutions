#include <cmath>
#include <iostream>
using namespace std;
 
int main() {
    int L =0 , b=0 , count=0;
    cin >> L >> b;
    while(true){
        if(L>b){
            break;
        }
        else{
            L=L*3;
            b=b*2;
            count++;
        }
    }
    
    cout <<count <<endl;
 
    return 0;
}
