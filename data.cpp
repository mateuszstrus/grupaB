class Samochod
{

 public:
        friend class Uzytkownik;
        char* marka;
        char* model;
        char* nrrejestracyjny;
        bool zaplon;
        unsigned short predkosc;

        Samochod (unsigned short p=0)
        {

            this->predkosc=p;
          }

 void produkuj (char* m, char* mo, char* nrr)
 {
      this->marka=m;
      this->model=mo;
      this->nrrejestracyjny=nrr;
  }

  void pokazdane ()
  {
   cout<<"Marka: "<<marka<<endl;
   cout<<"Model: "<<model<<endl;
   cout<<"Numer rejestracyjny: "<<nrrejestracyjny<<endl;
   }

      };