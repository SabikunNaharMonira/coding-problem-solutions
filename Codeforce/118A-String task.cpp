#include<bits/stdc++.h>
using namespace std;
 
int main() {
    string s="";
    cin >> s;
    char arr[s.length()];
    
    for(int i =0 ; i<s.length() ; i++){
        if(s[i]>='A' && s[i]<='Z'){
            arr[i]=(char)(s[i]+32);
        }
        else{
            arr[i]=s[i];
        }
    }
    
    for(int i=0 ; i<s.length() ; i++){
        if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='y'){
            continue;
        }
        else{
            cout << "."<<arr[i];
        }
    }
    
    cout<<endl;
    
 
    return 0;
}
