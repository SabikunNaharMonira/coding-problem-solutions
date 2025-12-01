
#include <iostream>
using namespace std;
 
int main() {
    
    int n = 0;
     int n1 , n2 , n3 ;
     int result=0;
     int count=0;
     
     
    cin >> n ;
    
    
    for(int i=1 ; i<=n ; i++){
       cin >> n1 >> n2 >> n3 ;
       result=n1+n2+n3;
       if(result>=2 && result <=3){
           count++;
       }
    }
    
    
    cout << count <<endl;
    return 0;
}
