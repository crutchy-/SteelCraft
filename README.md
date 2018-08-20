# SteelCraft
Spigot plugin for simulating steel structures in MineCraft.


The intention is to initially treat andesite as a sort of 'steel' element to be analysed using a basic frame analysis routine.

Each andesite block will be treated as having a moment connection to adjacent andesite blocks.
All other blocks will be treated as applying load only (non-structural).
Blocks requiring a pickaxe will be assumed to have rigid connection between them (which will allow overhangs).
Blocks that can be mined with a shovel will be treated as having no connection (vertical bearing load only).

After computing total applied loads to each steel (andesite) element, internal loads (plane shears, torsion, axial force and bending moments) will be computed using FEA methods.
Then code checks will be performed based on AS 3990-1993 (working stress), treating each element as having a solid square 1m x 1m cross-section.
Any andesite block that fails a code check will cause all blocks in the same load path to be set to collapse (like sand or gravel).
