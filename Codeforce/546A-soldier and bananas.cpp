#include<bits/stdc++.h>
using namespace std;
 
int main() {
    int n =0 , w=0 , k=0 , total=0 , borrow=0;
    cin >> k >> n >> w;
    for(int i = 1 ; i<=w ; i++){
        total+= k*i;
    }
    if(total>n){
    borrow= total-n;
    cout << borrow << endl;
    }
    else{
        cout << "0" << endl;
    }
    
    return 0;
}
