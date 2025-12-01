#include <cmath>
#include <iostream>
using namespace std;
 
int main() {
    int n =0 , count=0;
    string s="";
    cin >> n >> s;
    int i = 0 ;
    while (i<n){
            if(s[i]==s[i+1]){
                count++;
            }
            i++;
    }
    
    cout <<count <<endl;
 
    return 0;
}
