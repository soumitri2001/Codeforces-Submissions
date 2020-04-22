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
        ll k=2,x=1;
        if(isprime(n)) {
            cout << x <<"\n";
            continue;
        }
        while(k<n)
        {
            ll d=(1<<k)-1;
            if(n%d==0) {
                x=n/d; break;
            }
            k+=1;
        }
        cout << x <<"\n";
    }

	return 0;
}
