class Bitset {
    string bitset, inv_bitset;
    int sz;
    int counter;
public:
    Bitset(int size) {
        for(int i = 0; i < size; i++) {
            bitset.push_back('0');
            inv_bitset.push_back('1');
        }
        sz = size;
        counter  = 0;
    }
    
    void fix(int idx) {
        if(bitset[idx] == '0') counter++;
        bitset[idx] = '1';
        inv_bitset[idx] = '0';
    }
    
    void unfix(int idx) {
        if(bitset[idx] == '1') counter--;
        bitset[idx] = '0';
        inv_bitset[idx] = '1';
    }
    
    void flip() {
        swap(bitset, inv_bitset);
        counter = sz - counter;
    }
    
    bool all() {
        return counter == sz;
    }
    
    bool one() {
        return counter > 0;
    }
    
    int count() {
        return counter;
    }
    
    string toString() {
        return bitset;
    }
};