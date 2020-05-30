class run_faster //Konstruktor przyspieszania
{
    public:
        run_faster()
        {
            cout<<"Konstrukor przyspieszania"<<endl;
        }
    void przyspieszamy()
    {
        if (znak==119)
        {
            if(rpm>=2200 && rpm<=3500)
            {
                if (i<5)
                {
                    cout<<"To jest idealny moment na zmiane biegu na wyzszy. Chcesz go zmienic? Jezeli tak wcisnij z:"<<endl;
                }
            }
            var_temp= rand() % 5 + 1;
            x = rand() % 250 + 50;
            if (rpm>8000)
                {
                    rpm+=var_temp;
                    rpm+=x;
                    cout<<"Zblizasz sie do granicy odciecia mocy. Miej litosc dla samochodu i zwolnij."<<endl;
                    danger+=1;
                }
            else
            {
                speed+=var_temp;
                rpm+=x;
            }
        cout << "Aktualna predkosc wynosi: "<<speed<<endl;
        cout << "Obroty silnika wynosza: "<<rpm<<endl;
        while( kbhit() )
        {
            znak = getch();
            cout << "Aktualna predkosc wynosi: "<<speed<<endl;
            cout << "Obroty silnika wynosza: "<<rpm<<endl;
        }
    }
}
~run_faster()
{
    cout<<"Destruktor przyspieszania"<<endl;
}
};