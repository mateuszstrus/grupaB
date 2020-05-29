class engine_on //klasa zap³onu
{
    public:
        engine_on()
        {
            cout<<"Konstruktor zaplonu"<<endl;
        }
    void odpal()
    {
        cout << "Zaplon wlaczony. \n Samochod uruchomiony i jest gotowy do manewrow." << endl;
        rpm=700;
    }
        ~engine_on()
            {
                cout<<"\n Destruktor zaplonu"<<endl;
            }
};
