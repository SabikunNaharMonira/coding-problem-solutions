#include<bits/stdc++.h>
using namespace std;
 
int main() {
    int x=0;
    int count=0 , r=0;
    cin >> x;
    if(x>4){
        count+=x/5;
        r=x/5;
        x=x-(5*r);
    }
 
    if(x>3){
        count+=x/4;
        r=x/4;
        x=x-(4*r);
        
    }
    if(x>2){
        count+=x/3;
        r=x/3;
        x=x-(3*r);
    }
    if(x>1){
        count+=x/2;
        r=x/2;
        x=x-(2*r);
    }
    if(x>0){
       count+=x;
    }
    
    cout <<count <<endl;
    
    
    
    return 0;
}
