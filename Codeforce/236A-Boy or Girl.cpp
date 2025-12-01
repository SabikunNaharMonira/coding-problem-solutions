#include <bits/stdc++.h>
using namespace std;
 
int main() {
    string s;
    cin >> s;
    bool common = false;
    int count = 0;
    
    for (int i = 0; i < s.length(); i++) {
        common = false;  
        for (int j = i + 1; j < s.length(); j++) { 
            if (s[i] == s[j]) {
                common = true;  
                break; 
            }
        }
        if (!common) {
            count++;
        }
    }
    if (count % 2 == 0) {
        cout << "CHAT WITH HER!" << endl;
    } else {
        cout << "IGNORE HIM!" << endl;
    }
 
    return 0;
}
