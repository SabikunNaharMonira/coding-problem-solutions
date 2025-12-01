#include<bits/stdc++.h>
using namespace std;
 
int main(){
  string s1;
  cin>>s1;
  char arr[s1.length()-1];
  int j = 0;
  for(int i = 0; i < s1.length(); i += 2){
    arr[j]= s1[i];
    j++;
  }
  
  sort(arr, arr+j);
  
  
  for(int k = 0; k < j; k++){
      //dekhchi j last index shoman kina , ekhn arr er lenth e strt 0 theke tai // 1 minus korte hobe
    if(k == j-1){
      cout<<arr[k];
    }
    else{
      cout<<arr[k]<<"+";
 
    }
  }
 
  return 0;
}
