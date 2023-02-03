

#include <iostream>
#include <string>
#include <vector>

#include<unordered_map>
class Tree { 
    
    public:
        // Intrinsic state
        int x, y, age;

        // Extrinsic
        int height, width, type;

};

class TreeType { 
    public: 
        int id, texture_id;
        std::string name;

    // Constructor that takes 3 parameters in order to initialize the data memebers of the TreeType 
    TreeType(int id, int texture_id, std::string name) : id(id), texture_id(texture_id), name(name)  { 
    }
};

class Forest { 
    public:
    std::unordered_map<int, TreeType> treeTypes;
    std::vector<Tree> trees;

        Forest() {
            treeTypes =  {
                {0, TreeType(0, 1, "Oak")},
                {1, TreeType(1, 1, "Pine")},
                {2, TreeType(2, 1, "Maple")},
                {3, TreeType(3, 1, "Birch")}
            };
        }

        void AddTree(int x, int y, int age, int height, int width, int type) {
            Tree tree;
            tree.x = x;
            tree.y = y;
            tree.age = age;
            tree.height = height;
            tree.width = width;
            tree.type = type;
            trees.push_back(tree);
        }

        void getAll() {
            for (auto tree : trees) { 

                std::cout << "TreeNode" << treeTypes[tree.type].name << "x" << tree.height
                
                << std::endl;
            }
        }
};

int main() { 
    Forest forest;
    forest.AddTree(0, 0, 10, 20, 30, 0);
    forest.AddTree(1, 1, 20, 25, 35, 1);
    forest.AddTree(2, 2, 30, 30, 40, 2);
    forest.AddTree(3, 3, 40, 35, 45, 3);
    forest.getAll();
    std::string hello = "helloword";
    std::cout << hello;

    return 0;
}