# The Nand to Tetris Software Suite - Modification

This repo contains modifications to the outdated Nand to Tetris Software Suite. These modifications are intended to update outdated featuers (e.g. outdated UI) to better the user experience for students in a computer organization class.

Below is a markdown template for use with the progression of the software modification. Major points are to be updated with meaningful descriptions and comments to explain those updates.

## Testing

E# Testing
As our project completely revolves around redeveloping the GUI of an already finished project, our testing is somewhat simplified. Most of our testing simply involves testing our new GUI to make sure the previous functionality is still there. 

 

### Hardware Simulator
- The first round of testing involves following the [Hardware Simulator Tutorial](https://b1391bd6-da3d-477d-8c01-38cdf774495a.filesusr.com/ugd/44046b_bfd91435260748439493a60a8044ade6.pdf) supplied by the original Nand-2-Tetris project. This outlines the simple use of the GUI and ensures that all of the elementary functionality is there.
- The second round of testing will be completing each of the [lessons](https://www.nand2tetris.org/course) supplied in the Nand-2-Tetris course. This show the use of the program in all of its intended ways, and will help expose the Hardware Simulator if any of the more advanced functionality is lacking

### VMEmulator

- For this GUI, we also incorporated the tutorial given by the official nand2tetris website (https://b1391bd6-da3d-477d-8c01-38cdf774495a.filesusr.com/ugd/44046b_b74d071ee4b74279b211acede232ced9.pdf). The tutorial outlines the basic uses of running the VMEmulator which has some similar interactions as the other three applications (such as the tool bar and the menu bar). 


- In order to pinpoint the additional functionality used within the VMEmulator, it was sufficient to go through the course lessons provided within the nand2tetris website (Linked above with Hardware Simulator).

### CPUEmulator

- Each of the CPU-related classes (CPU, CPUEmulator, CPUComponent, etc.) is being given test inputs in the driver code to test the logic and ensure the right values are being passed throughout the system. Similarly to the other emulators, the nand2tetris tutorial's walkthrough suffices as basic tests.



## Authors

* **John Bao Nguyen** - *Project Setup* - [@waejay](https://github.com/waejay)
* **Chris J. Jeon**
* **Mason B. Witcraft**
* **Brett M. Norton**
* **Jason F. Tieu**
* **Dr. Nicolas Grounds**

## License

This project is licensed under the GNU GPL (General Public License) - see the [LICENSE.md](LICENSE.md) file for details
