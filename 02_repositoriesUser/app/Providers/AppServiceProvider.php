<?php

namespace App\Providers;

use App\Src\Repositories\UserRepository;
use App\Src\RepositoriesImp\UserEloquentRepository;
use App\Src\RepositoriesImp\UserStoregeRepository;
use Illuminate\Support\ServiceProvider;

class AppServiceProvider extends ServiceProvider
{
    /**
     * Register any application services.
     */
    public function register(): void
    {
        //
        $this->app->bind(UserRepository::class, UserEloquentRepository::class);
        //$this->app->bind(UserRepository::class, UserStoregeRepository::class);
    }

    /**
     * Bootstrap any application services.
     */
    public function boot(): void
    {
        //
    }
}
