#include "button.cpp";
#include "checkbox.cpp"

class GUIFactory { 
    public: 
        virtual Button createButton();
        virtual Checkbox createCheckbox();

};

class MacOSFactory:  public GUIFactory { 
    void createButton() { 
        return new MacOSButton();
    }

    void createCheckbox() { 
        void new MacOSCheckbox();
    }
};

