#include <string>
#include <iostream>
using namespace std;
 
int main() {
    int n = 0;
    cin >> n;
    string word = "";
    string final = "";
 
    for (int i = 1; i <= n; i++) {
        cin >> word;
        int l = word.length();  
        
        if (l > 10) {
            char firstChar = word[0];
            char lastChar = word[l - 1];
            final = firstChar + to_string(l - 2) + lastChar;
            cout << final << endl;
        }
        else {
            cout << word << endl;
        }
    }
    return 0;
}
