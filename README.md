# SteelCraft
Spigot plugin for simulating steel structures in MineCraft.


The intention is to initially treat andesite as a sort of 'steel' element to be analysed using a basic frame analysis routine.

Each andesite block will be treated as having a moment connection to adjacent andesite blocks.
All other blocks will be treated as applying vertical gravitational load only (non-structural).

After computing total applied loads to each steel (andesite) element, internal loads (plane shears, torsion, axial force and bending moments) will be computed using linear-static FEA methods.
Then code checks will be performed based on AS 3990-1993 (working stress), treating each element as having a solid square 1m x 1m cross-section.
Any andesite block that fails a code check will be turned into granite.


# Commands

/steel-solve x1,y1,z1 x2,y2,z2
/steel-solve last
/steel-solve undo

Solver coords parameters are diagonally opposite and define a 3D space within which the solver will treat andesite as strucutral elements and other blocks as load.
The 'undo' parameter will undo transformations from andesite to granite for the last solve only.
The 'last' parameter will perform a solve using the last specified coordinates.

Any andesite block just inside any face of the solve envelope boundary that has another block (of any type) immediately adjacent and outside will be treated as having a pinned support. Roller and built-in supports will not initially be supported.
