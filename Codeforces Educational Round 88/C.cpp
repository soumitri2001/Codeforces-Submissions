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
    ll Q;
	cin>>Q;
	while(Q--)
    {
        double h,c,t;
        cin>>h>>c>>t;
        ll ans=1LL;
        if(h==t) {
            cout<<1<<"\n";continue;
        }
        if(h+c==2*t) {
            cout<<2<<"\n";continue;
        }
        double delta=abs(t-h);
            if(abs((h+c)/2-t)<delta) {
                ans=2LL; delta=abs((h+c)/2-t);
            }
        if(h+c!=2*t)
        {
            // delta=abs(t-h);
            // if(abs((h+c)/2-t)<delta) {
            //     ans=2LL; delta=abs((h+c)/2-t);
            // }
            double tmp=(t-c)/(2*t-(h+c));
            double x1=floor(tmp),x2=ceil(tmp);
            if(x1>1) {
                double ans1=abs((x1*h+(x1-1)*c)/(2*x1-1)-t);
                if(ans1<delta){
                    ans=2*x1-1; delta=ans1;
                }
            } if(x2>1) {
                double ans2=abs((x2*h+(x2-1)*c)/(2*x2-1)-t);
                if(ans2<delta){
                    ans=2*x2-1; delta=ans2;
                }
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}


