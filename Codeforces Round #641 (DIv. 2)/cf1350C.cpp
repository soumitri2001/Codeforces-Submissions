#include<bits/stdc++.h>
using namespace std;

typedef long long int ll;
typedef long long l;

ll _gcd(ll x, ll y)
{
    if(y>x) swap(x,y);
    if(y==0) return x;
    else return _gcd(y,x%y);
}
ll mod_pow(ll a, ll b, ll mod)
{
     a%=mod;
     if(b==0) return 1%mod;
     if((b&1)==1) return a*(mod_pow(a,b-1,mod))%mod;
     else 
     {
        ll u=mod_pow(a,b>>1,mod);
        return (u*u)%mod;
     }
}
ll _pow(ll a, ll b)
{
     if(b==0) return 1;
     ll u=1;
     while(b) {
         if(b&1) u*=a;
         b>>=1; a*=a;
     }
     return u;
}
ll modInv(ll a, ll m)
{
    if(_gcd(a,m)==1) return (a%m+m)%m;
    else return -999;
}
bool isprime(ll x)
{
    for(ll i=2;i*i<=x;i++)
    {
        if(x%i==0) return false;
    }
    return true;
}
bool isPowerOfTwo(ll x) 
{ 
    return x!=0 && ((x&(x-1)) == 0);          
}

/* const ll _INT_MAX=200001;
vector<bool> prime(_INT_MAX,true);
vector<ll> Primes;
void sieve() {
    // memset(prime,true, sizeof prime);
    // std::fill(std::begin(prime), std::end(prime), true);
    prime[0]=prime[1]=false;
    for(int i=2;i<=sqrt(_INT_MAX);i++) {
        if(prime[i]) {
            for(int j=i*2;j<=_INT_MAX;j+=i)
            prime[j]=false;
        }
    }
    for(int i=0;i<prime.capacity();i++) {
        if(prime[i]) Primes.push_back(i);
    }
} */

int main() {
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL); cout.tie(NULL);
    //your code starts here
    ll n; cin>>n;
    vector<ll> a(n),g(n-1),suf(n);
    for(int i=0;i<n;i++) cin>>a[i];
    suf[n-1]=a[n-1];
    for(int i=n-2;i>=0;i--) {
        suf[i]=_gcd(suf[i+1],a[i]);
    }
    for(int i=0;i<n-1;i++) {
        g[i]=(a[i]*suf[i+1])/_gcd(suf[i+1],a[i]);
    }
    //ll ans=g[0];
    for(int i=1;i<n-1;i++) {
        //ans=_gcd(ans,g[i]);
        g[i]=_gcd(g[i],g[i-1]);
    }
    cout<<g[n-2]<<endl;
    return 0;
}


