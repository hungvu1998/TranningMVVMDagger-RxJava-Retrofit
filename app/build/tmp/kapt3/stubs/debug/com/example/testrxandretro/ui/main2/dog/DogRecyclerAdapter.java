package com.example.testrxandretro.ui.main2.dog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u0018"}, d2 = {"Lcom/example/testrxandretro/ui/main2/dog/DogRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "recyclerClickItem", "Lcom/example/testrxandretro/ui/main2/dog/RecyclerClickItem;", "(Lcom/example/testrxandretro/ui/main2/dog/RecyclerClickItem;)V", "dogs", "Lcom/example/testrxandretro/model/DogModel;", "getRecyclerClickItem", "()Lcom/example/testrxandretro/ui/main2/dog/RecyclerClickItem;", "setRecyclerClickItem", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPosts", "dog", "PostViewHolder", "app_debug"})
public final class DogRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private com.example.testrxandretro.model.DogModel dogs;
    @org.jetbrains.annotations.NotNull()
    private com.example.testrxandretro.ui.main2.dog.RecyclerClickItem recyclerClickItem;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.model.DogModel dog) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.main2.dog.RecyclerClickItem getRecyclerClickItem() {
        return null;
    }
    
    public final void setRecyclerClickItem(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.dog.RecyclerClickItem p0) {
    }
    
    public DogRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.main2.dog.RecyclerClickItem recyclerClickItem) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/testrxandretro/ui/main2/dog/DogRecyclerAdapter$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/testrxandretro/ui/main2/dog/DogRecyclerAdapter;Landroid/view/View;)V", "cardview", "Landroidx/cardview/widget/CardView;", "imageItemBreed", "Landroid/widget/ImageView;", "textItemBreedName", "Landroid/widget/TextView;", "bind", "", "dogs", "", "img", "recyclerClickItem", "Lcom/example/testrxandretro/ui/main2/dog/RecyclerClickItem;", "app_debug"})
    public final class PostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView textItemBreedName;
        private android.widget.ImageView imageItemBreed;
        private androidx.cardview.widget.CardView cardview;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String dogs, @org.jetbrains.annotations.NotNull()
        java.lang.String img, @org.jetbrains.annotations.NotNull()
        com.example.testrxandretro.ui.main2.dog.RecyclerClickItem recyclerClickItem) {
        }
        
        public PostViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}