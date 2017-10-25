# -*- coding: utf-8 -*-

# This is free to use as it was only made for practice.

def make_matrix_from_array(values, col):
    mat = [ values[ i : i + col ] for i in range( 0, len( values ), col ) ]
    return mat