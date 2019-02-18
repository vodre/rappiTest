package com.vodrex.mdb.databinding;
import com.vodrex.mdb.R;
import com.vodrex.mdb.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailBindingImpl extends ActivityMovieDetailBinding implements com.vodrex.mdb.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainview, 5);
        sViewsWithIds.put(R.id.movie_details_scroll, 6);
        sViewsWithIds.put(R.id.viewA, 7);
        sViewsWithIds.put(R.id.viewB, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            );
        this.avatarOwner.setTag(null);
        this.fab.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.vodrex.mdb.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.listener == variableId) {
            setListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.vodrex.mdb.ui.viewmodel.MovieDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable android.view.View.OnClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.vodrex.mdb.ui.viewmodel.MovieDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTextOverview((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsVisibleFAB((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPosterUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTextOverview(androidx.databinding.ObservableField<java.lang.String> ViewModelTextOverview, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVisibleFAB(androidx.databinding.ObservableBoolean ViewModelIsVisibleFAB, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPosterUrl(androidx.databinding.ObservableField<java.lang.String> ViewModelPosterUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> viewModelTextOverview = null;
        androidx.databinding.ObservableBoolean viewModelIsVisibleFAB = null;
        java.lang.String viewModelPosterUrlGet = null;
        android.view.View.OnClickListener listener = mListener;
        androidx.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        int viewModelIsVisibleFABViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPosterUrl = null;
        boolean viewModelIsVisibleFABGet = false;
        java.lang.String viewModelTextOverviewGet = null;
        com.vodrex.mdb.ui.viewmodel.MovieDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.textOverview
                        viewModelTextOverview = viewModel.getTextOverview();
                    }
                    updateRegistration(0, viewModelTextOverview);


                    if (viewModelTextOverview != null) {
                        // read viewModel.textOverview.get()
                        viewModelTextOverviewGet = viewModelTextOverview.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVisibleFAB
                        viewModelIsVisibleFAB = viewModel.isVisibleFAB();
                    }
                    updateRegistration(1, viewModelIsVisibleFAB);


                    if (viewModelIsVisibleFAB != null) {
                        // read viewModel.isVisibleFAB.get()
                        viewModelIsVisibleFABGet = viewModelIsVisibleFAB.get();
                    }
                if((dirtyFlags & 0x62L) != 0) {
                    if(viewModelIsVisibleFABGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.isVisibleFAB.get() ? View.VISIBLE : View.GONE
                    viewModelIsVisibleFABViewVISIBLEViewGONE = ((viewModelIsVisibleFABGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.getTitle();
                    }
                    updateRegistration(2, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.posterUrl
                        viewModelPosterUrl = viewModel.getPosterUrl();
                    }
                    updateRegistration(3, viewModelPosterUrl);


                    if (viewModelPosterUrl != null) {
                        // read viewModel.posterUrl.get()
                        viewModelPosterUrlGet = viewModelPosterUrl.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.ensar.tmdbkotlin.utils.ExtensionsKt.setImageUrl(this.avatarOwner, viewModelPosterUrlGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.fab.setVisibility(viewModelIsVisibleFABViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTitleGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelTextOverviewGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        android.view.View.OnClickListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.textOverview
        flag 1 (0x2L): viewModel.isVisibleFAB
        flag 2 (0x3L): viewModel.title
        flag 3 (0x4L): viewModel.posterUrl
        flag 4 (0x5L): listener
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.isVisibleFAB.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.isVisibleFAB.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}