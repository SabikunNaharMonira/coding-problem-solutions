#include <iostream>
#include <cctype>
using namespace std;
 
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    
    for (int i = 0; i < min(s1.length(), s2.length()); i++) {
        char x = tolower(s1[i]); 
        char y = tolower(s2[i]); 
        
        if (x > y) {
            cout << "1" << endl;
            return 0; 
        }
        if (x < y) {
            cout << "-1" << endl;
            return 0;  
        }
    }
        cout << "0" << endl;  
    
    return 0;
}
