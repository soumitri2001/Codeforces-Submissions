#include<bits/stdc++.h>
typedef long long int ll;
using namespace std;

int main()
{
    ll n,m,i,k,b;
    cin >>n >> m;
    ll a[n];
    ll prf[n+1];
    prf[0]=0;
    for(i=0;i<n;i++)
    {
        cin >> a[i];
        prf[i+1]=prf[i]+a[i];
    }
    for(i=0;i<m;i++)
    {
        cin >> b;
        k=1;
        while(b>prf[k])
        {
            k++;
        }
        cout << k << " " << b-prf[k-1] <<"\n";
    }
    return 0;
}
