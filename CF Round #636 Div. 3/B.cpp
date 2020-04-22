#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long long int lli;

ll gcd(ll x, ll y)
{
    if(y==0) return x;
    else return gcd(y,x%y);
}
bool isprime(ll x)
{
    for(ll i=2;i*i<=x;i++)
    {
        if(x%i==0) return false;
    }
    return true;
}

int main() {
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL); cout.tie(NULL);
    //your code starts here
    ll t; cin>>t;
    while(t--)
    {
        ll n;
        cin>>n;
        if((n&2)!=0) {
            cout<<"NO"<<"\n";
            continue;
        }
        vector<ll> a(n);
        for(ll i=0;i<n/2;i++) a[i]=(i+1)*2;
        ll k=1;
        for(ll i=n/2;i<n-1;i++) {
            a[i]=k; k+=2;
        } k=n/2;
        a[n-1]=k*(k+1)-(k-1)*(k-1);
        cout<<"YES"<<"\n";
        for(auto x:a)
        {
            cout<<x<<" ";
        }
        cout<<"\n";
    }

	return 0;
}
