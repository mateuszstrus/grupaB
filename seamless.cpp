class car_seamless
{
    public:
     car_seamless()
     {

     }
    void bieg_up()
{
    if (i<5)
    {
        obrotomierz=1000;
        cout<<"Wrzucono wyzszy bieg. Aktualny bieg: "<<i+1<<endl;
        i++;
    }
    else
    {
        cout<<"Zmiana biegu na wyszy nie jest mozliwa."<<endl;
    }

}
 void bieg_down()
{
    obrotomierz=2400;
    cout<<"Wrzucono nizszy bieg. Aktualny bieg "<<i-1<<endl;
    i--;
    if (i<1)
    {
        cout<<"Wrzucony luz. Pamietaj iz jazda na biegu neutralnym nie jest bezpieczna"<<endl;
    }

}
~car_seamless()
{
    cout<<"Destruktor";
}
};