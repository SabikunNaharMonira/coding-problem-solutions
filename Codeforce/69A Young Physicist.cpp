#include<bits/stdc++.h>
using namespace std;
 
int main() {
    int n =0 ;
    cin >> n ;
    int x = 0 , y=0 , z=0;
    int j=1;
    while(j<=n){
        int arr[3];
    for(int i =0 ; i<3 ; i++){
       cin >> arr[i] ;
    }
    x+=arr[0];
    y+=arr[1];
    z+=arr[2];
    j++;
    }
    
    if(x!=0 || y!=0 || z!=0){
        cout << "NO" <<endl;
    }
    else{
    cout << "YES" <<endl;
    }
    return 0;
}
