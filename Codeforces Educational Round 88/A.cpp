#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long long int li;
#define pb push_back
#define ff first
#define ss second
#define FOR(n) for(int i=0;i<n;i++)
#define FORD(n) for(int i=n-1;i>=0;i--)

int main() {
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL); cout.tie(NULL);
    //your code starts here
    ll t; cin>>t;
    while(t--)
    {
        ll n,m,k;
        cin>>n>>m>>k;
        ll val=n/k;
        ll ans;
        if(m>val) {
            float x=(k-1)*1.0;
            ans=val-ceil((m-val)/x);
        }
        else ans=m;
        cout<<ans<<"\n";
    }

    return 0;
}


