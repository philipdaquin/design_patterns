#include "button.cpp";
#include "checkbox.cpp"

class GUIFactory { 
    public: 
        virtual Button createButton();
        virtual Checkbox createCheckbox();

};

class MacOSFactory:  public GUIFactory { 
    Button createButton() { 
        return MacOSButton();
    }

    Button createCheckbox() { 
        return MacOSCheckbox();
    }
};

