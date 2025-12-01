#include <iostream>
#include <string>
using namespace std;
 
int main() {
    int n =0;
    string s1 = "";
    int count =0;
    cin >> n;
    for(int i = 1 ; i<=n ; i++){
        cin >> s1;
        if(s1[1] == '+'){
            count++;
        }
        else{
            count--;
        }
    }
    cout<< count << endl;
    return 0;
}
