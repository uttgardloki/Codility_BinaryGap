#include <iostream>
#include <vector>

using namespace std;

int solution(int N);
int main(){
    int number = 561892;
    cout << solution(number) << endl;
}

int solution(int N){
    int count = 0;
    int gap = -1;
    vector<int> binGap;
    for(int i = N; i > 0;  i = i / 2){
        binGap.insert(binGap.begin(), i % 2);
    }

    for( int k = 0; k < binGap.size(); k++) {
        if (binGap[k] == 0){
            count++;
        }
        else{
            if(gap < count ){
                gap = count;
            }
            count = 0;
        }
    }
    return gap;
}