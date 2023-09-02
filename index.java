Class User {
public:
    virtual void access() = 0; // Pure virtual function for access rights
};

class Administrator : public User {
public:
    void access() override {
        // Full access code here
    }
};

class Consultant : public User {
public:
    void access() override {
        // Consultant access code here
    }
};

class JobSeeker : public User {
public:
    void access() override {
        // JobSeeker access code here
    }
};