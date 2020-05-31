    void zwalniamy()
    {
            cout << "Rozpoczynam sekwencje hamowania."<<endl;
        cout << "Aktualna predkosc wynosi: "<<predkosc<<endl;
        cout << "Obroty wynosza: "<<obrotomierz<<endl;
            if (predkosc<=1 || obrotomierz<600)
            {
                cout<<"Obroty silnika byly zbyt niskie. Aby uniknac uszkodzenia samochod zostal zgaszony. Ponowne uruchomienie nie jest mozliwe."<<endl;
                system("pause");
            }
            else if (predkosc<0)
            {
                cout<<"Obroty silnika byly zbyt niskie. Aby uniknac uszkodzenia samochod zostal zgaszony. Ponowne uruchomienie nie jest mozliwe."<<endl;
                system("pause");
            }
            else if (obrotomierz <1700)
            {
                cout << "To jest idealny moment na zmiane biegu na nizszy. Chcesz go zmienic? Jezeli tak wcisnij x:"<<endl;
            }


    pomocnicza= rand() % 4 + 1;
    x = rand() % 150 + 50;
    predkosc-=pomocnicza;
    obrotomierz-=x;
    }
    ~hamowanie()
    {

    }
};